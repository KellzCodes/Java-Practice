# Android Foundations

## Android Studio Tour
#### Meet Android Studio—the Integrated Development Environment (IDE) used for developing Android Apps

Android Studio is the main Integrated Development Environment (IDE) used for building Android Apps and is based on a Java IDE called IntelliJ IDEA.

While it’s mainly used for writing Android code, the program itself contains several useful features for making the entire development process easier. These include things like a customized code editor, code templates, a rich layout editor with support for drag and drop editing, and tools to catch performance, usability and version compatibility problems. It also allows you to easily run your app on device emulators and real devices.

When you open Android Studio for the first time it allows you to bootstrap a project from a number of pre-built templates. Then, once your app is ready to deploy to the app store, the Gradle tool can be used to package all of the app’s source code and resources together into a **.APK** file (the extension for an Android app)

Click the video below for more info:

[![Android Studio Tour](http://img.youtube.com/vi/TYz3ASFhlPE/0.jpg)](http://www.youtube.com/watch?v=TYz3ASFhlPE "Android Studio Tour")

### Review:
- Android Studio uses Gradle as a build tool to package projects into .APK files.
- Android Studio includes a suite of emulators which developers can use to test their apps.

## Installing Android Studio
#### Get the Android IDE running on your own computer

Android Studio is the main Integrated Development Environment (IDE) used for building Android Apps and is based on a Java IDE called IntelliJ IDEA.

While it’s mainly used for writing Android code, the program itself contains several useful features for making the entire development process easier. These include things like a customized code editor, code templates, a rich layout editor with support for drag and drop editing, and tools to catch performance, usability and version compatibility problems. It also allows you to easily run your app on device emulators and real devices.

Let’s take a look at how to install Android Studio on both Mac and Windows:

### Mac Download & Installation

**Note**: These instructions will walk you through how to download the newest version on Android Studio. The UI of this version is slightly different than the one you’ll see in our instructional videos since we recorded those with an older version of Android Studio. If you’d like to follow along on the exact same version we’re using, check out the video at the end of this article.

Click the video below to see Mac Download and Install

[![Mac Download and Install](http://img.youtube.com/vi/COLa86dU2rg/0.jpg)](http://www.youtube.com/watch?v=COLa86dU2rg "Mac Download and Install")

1. In your web browser, navigate to the [Android Studio website](https://developer.android.com/studio), and click the large download button which should download the .dmg file onto your computer.
2. Head over to your downloads folder and double click the file, and when prompted drag Android Studio into the **Applications** folder.
3. Now open Android Studio and walk through the setup wizard. Choose the “Standard” installation, select whichever UI theme you prefer, and click “Finish”.
4. A “Welcome to Android Studio” screen should now pop up, and you’re ready to start developing!

### Windows Download & Installation

Click the video below to see Windows download and install:

[![Windows Download and Install](http://img.youtube.com/vi/wlpFwwCU_mc/0.jpg)](http://www.youtube.com/watch?v=wlpFwwCU_mc "Windows Download and Install")

1. In your web browser, navigate to the [Android Studio website](https://developer.android.com/studio), and click the large download button which should download the executable file onto your computer.
2. Now run the Android Studio executable file and walk through the setup wizard. When prompted, be sure to check the boxes to install both Android Studio and Android Virtual Device, choose the “Standard” installation, select whichever UI theme you prefer, and click “Finish”.

### Downloading the Specific Version Used in this Course

The newest version of Android Studio looks slightly different than the version used in our videos. Instructions will be mostly the same and you should be able to follow along without issues. But, if you’d prefer to download the exact same version featured in our videos, here’s how you can download that version instead. Click the video below:

[![Android Studio Download Archives](http://img.youtube.com/vi/mMlomIa-NMY/0.jpg)](http://www.youtube.com/watch?v=mMlomIa-NMY "Android Studio Download Archives")

## Introduction to XML
#### Learn about XML

XML stands for **E**xtensible **M**arkup **L**anguage. XML is a specific structure for formatting documents to be readable by both humans and computers. If that sounds super general, that’s because it is.

Unlike most programming languages (and even other markup type languages like HTML) XML has no opinions about the purpose or type of data it encodes, rather it is a set of rules for how data should be organized.

Let’s look at an example of XML in action:

```
<drivers-license>
    <name>Mike Dane</name>
    <sex>Male</sex>
    <eye-color>Brown</eye-color>
    <organ-donor />
</drivers-license>
```

In the code above, we’re using XML to encode driver’s license information.

In order to meaningfully represent our driver’s license information, we want to indicate both the type of information we’re representing (eg. ```name```) and also the specific value relevant to this driver (```Mike Dane```).

XML allows us to do this easily by using *tags*.

### Container Tags

Tags are special containers in XML where we can store specific pieces of information. For the name, sex and eye color fields above, we’re using container tags and storing the driver’s information inside of them.

```
<eye-color>Brown</eye-color>
```

Container tags consist of two parts: a start tag (```<eye-color>```) and an end tag (```</eye-color>```) with an element name inside of them (```eye-color```).

The element name in the code above, ```eye-color```, is placed inside less than and greater than symbols, and is used to define the type of information contained within the tags.

With the information encoded in this way, a computer program could parse through the XML document and figure out that the driver’s eye color is ```Brown``` by looking inside the ```eye-color``` container tags.

### Tags used for grouping

We can also use these container tags to group related data together.

```
<drivers-license>
    <name>Mike Dane</name>
    <sex>Male</sex>
     ...
</drivers-license>
```

Notice in our driver’s license document that we’re also defining a ```<drivers-license>...</drivers-license>``` container tag, which has other, more specific elements inside of it. This is a common practice, and is often used to wrap related data into groups.

Theoretically we might have an xml document storing hundreds of driver’s licenses, each one being contained in a ```<drivers-license>``` tag.

We could do something similar with the driver’s name field:

```
<drivers-license>
    <name>Mike Dane</name>
    ...
</drivers-license>
```

Instead of storing their first and last name in the same ```<name></name>``` tag, we’ll use the name tag as a grouping container and create separate tags for first and last:

```
<drivers-license>
    <name>
        <first>Mike</first>
        <last>Dane</last>
    </name>
    ...
</drivers-license>
```

In the example above we now have three levels of nesting: ```drivers-license``` -> ```name``` -> ```first/last```. This is one of the great things about XML, it’s useful not only for storing data, but for preserving the hierarchical relationships between the data.

### Single Tags

Container tags are used when we want to encode specific data values like name and eye color, or to group more specific elements like in the case of ```drivers-license``` or ```name```. But you’ll also notice another type of tag in the driver’s license XML, storing the ```<organ-donor />``` element.

```
<drivers-license>
    ...
    <organ-donor />
</drivers-license>
```

This is an example of a single tag. Single tags are self-closing, meaning we only need one tag not a separate tag for opening and closing.

The driver’s organ donor status lends itself to a single tag because it doesn’t need to enclose a specific value. A driver is either an organ donor or they’re not. So in the case of the driver’s license XML, if the ```<organ-donor />``` element is there, we know they’re an organ donor, and, if it’s not, we know they’re not— we can get all the information we need based on the existence of the tag.

We indicate a single tag by putting a forward slash ```/``` after the element name.

### Attributes

We’ve talked about the different types of tags and how we can use them to define the various elements, or pieces of information in our XML document. The final tool we can use in XML are *attributes*.

Attributes are special pieces of information we can define about an element within its tag.

```
<drivers-license state=”NY”> … </drivers-license>
```

In the code above we’re using an attribute to define information about the driver’s license element. In this case, defining the ```state``` where the license was issued.

Attributes are placed after the element name and contain the attribute name followed by an equal sign with the attribute’s value placed inside quotation marks.

Attributes can be named anything. It’s sometimes common practice for every element of the same type to have the same attributes— so every ```drivers-license``` element in our document could have a ```state``` attribute.

### Review
- XML stands for Extensible Markup Language
- An XML document is composed of a series of Elements which are organized in a hierarchical fashion through the use of Tags
- Container tags consist of two separate tags: a start tag and an end tag.
- Container tags can have other tags nested inside of them.
- Single tags are self-closing, meaning they only have one tag.

## XML in Android
#### Learn about how XML is used in Android Development

Let’s learn a little bit about how XML is used in developing Android applications.

During Android production, we’ll use XML to store important data about our Android application. We’ll also be using XML to encode specific details at the individual screen level—information about how the app should look and the relationships that different UI elements should have with one another. 

Click the video below:

[![Introduction to XML](http://img.youtube.com/vi/O7fmNwbtCjo/0.jpg)](http://www.youtube.com/watch?v=O7fmNwbtCjo "Introduction to XML")

### Review
- XML is used in an app’s main configuration file —**AndroidManifest.xml**.
- XML is used is for defining application layouts.

## Android Stack
#### Learn about the Android stack and how different layers of software come together to make Android applications.

Android runs on billions of devices around the world. Let’s learn a little bit more about the operating system that makes all of this possible. The Android operating system is actually a *stack* composed of five different layers—five individual software elements. Each has its own role to play and unique ways that developers can directly or indirectly interact with them.

It’s helpful to think of the layers of the stack as building blocks. Each one builds on the one below it adding more and more functionality until you end up with an Android phone.

Certain layers of the stack are *abstracted* away from developers. This means that Android developers are not meant to interact with these layers of the stack directly. These are written and maintained by Google employees and contributors in the open-source community. Other layers of the stack, however, are used directly by Android developers—including us as we develop Android applications in this course!

The layers of the stack in order are:

- Apps
- Java API framework
- Libraries and Android Runtime
- Hardware abstraction layer (HAL)
- Linux kernel

While it’s not necessary to understand each layer in its entirety, having an appreciation for what they all do is a great way to increase your knowledge as an Android developer and ultimately help you to write better, more optimized code.

Click the video below:

[![Android Stack](http://img.youtube.com/vi/yNjorD89BPw/0.jpg)](http://www.youtube.com/watch?v=yNjorD89BPw "Android Stack")

### Review
- Apps are programs that run on Android and are composed of one or more interactive screens.
- System apps are replaceable apps the system has recognized as the default apps to perform common tasks like email, texting, camera stuff, etc.
- The Java API Framework is a set of software libraries and utilities developers leverage to build out their apps.
- The Android Runtime as an isolated container where each app lives and carries out its processes.
- The hardware abstraction layer (HAL) consists of a number of library modules that manage access to the hardware of an Android device like the camera, audio, Bluetooth, etc.
- The Linux kernel is the lowest layer of the stack and manages all the core operations of the operating system.