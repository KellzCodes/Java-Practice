# Wireframing
#### Learn how to build a wireframe for a website or app and why this is an important step in development

Before we build something, it’s a good idea to make a plan for what we’re going to build. For example, if we’re building a house, we shouldn’t do it without planning with designs and blueprints. When developers make plans for apps and websites, they often use *wireframes*.

A wireframe is a collection of sketches and notes that depict a website as it would look on a browser, a tablet, or a mobile device. It shows the layout of the app’s elements, like navigation bars, buttons, content placement, and more—it’s like the blueprint to our app! Here, we’ll be focussing on hand-drawn wireframes without too much detail; these are sometimes called *low-fidelity* wireframes.

The wireframe outlines the purpose of the app’s pages (or screens), answering questions like: “What is the user trying to get done when they see this page?” It also summarizes the relationships between different parts of the app and the results of interacting with the app’s elements, answering questions like: “What happens when the user clicks this button?”

With good designs and blueprints, an architect can help others envision living in a house that has yet to be built. And with a good wireframe, we will be able to show other people what our app does in considerable detail—all without writing a single line of code!

Like architecture, successful wireframing relies on the marriage of product design skills with technical understanding. So take a moment to get in touch with our artistic side and brush up a bit on our knowledge of the app platform’s limitations. Then, we’ll get started wireframing!

But first, a word of advice: As learning developers, we rarely know what is (or is not) possible to achieve on our target platform. When this is the case, there’s no harm in looking at popular applications for inspiration.

## Screens (“Rooms”)

The first step of wireframing is to list our application’s screens.

In app development, a *screen* is a self-contained user interface devoted to a particular purpose within the application. Individual web pages are the screens for a complicated website like *amazon.com*; think of how the shopping cart and the past orders are shown on separate, self-contained pages. Similarly, a smartphone’s clock application generally has separate screens for the current time and for setting alarms.

Designing an app’s screens is like the first step in designing a house. The house is divided into rooms, and the app is divided into screens. House and app designers must weigh similar considerations. For example, modern homes typically limit themselves to one kitchen. A single-family home with two kitchens would be cumbersome. (“Which kitchen did I leave my nonstick pan in, again?”) Likewise, a shopping site with two checkout pages, *Quick Checkout* and *Checkout*, will probably confuse its users.

Another home design mistake is failing to differentiate between rooms. In a small studio apartment, the cooking, sleeping, and living areas all tend to interfere with each other. Generally, people prefer to have separate rooms for these separate activities. It is similar for screens in the world of software. A good example is the story of how Adobe’s Photoshop gradually outgrew its “living arrangements” by adding features unrelated to photography. The developers tried to include print design, website design, custom typography, and more, all in the same screen. Later, Adobe shifted from the single-license/single-tool model by introducing Illustrator, InDesign, XD, and other software. Now, not only are the different functions of the old Photoshop found on different screens, they are in different applications!

Before we design our app’s screens, we need to look at the big picture, the purpose of our application. Does the app (“home”) need a single screen (“room”)? Maybe it needs 3? 10? What features does each screen implement? Make sure not to include too many features—not every house needs a swimming pool, and not every app needs to be a social network! Do the screens have well-differentiated purposes, or are they cramped like a studio apartment?

Now that we have a gameplan, let’s get to work. If you’d like, follow along with these steps envisioning any app—real or imagined—that sets your heart ablaze.

Let’s make a list of our app’s screens and the purpose(s) served by each.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/2.%20Wireframing%2C%20Java%20Variables%2C%20and%20Android%20Studio/pics/screens.webp" alt="screens" width="500"/>

## Flows (“Lifestyles”)

The second step of wireframing is to organize our app’s screens into flows.

A *flow* is the path a user takes through a piece of software. The flow models a typical user, predicting which screens they will need to visit and in which order. The point of considering flows is to make common chains of activities easier to accomplish for our app’s users. As an example, take a brand new user visiting a web application through its homepage. Afterward, they will usually need to create an account on the account creation page. Finally, they should be redirected to the application’s main page. Imagine the annoyance if this chain was broken at any point! If there was no link to account creation from the homepage, the new user could give up on joining the site. If the account creation page didn’t link (or better yet, automatically redirect) to the main page, the user would have to manually reload the home page—not very considerate of the developers.

Developers’ thinking about user flows through software is like an architect thinking about the lifestyles of the people who will inhabit their house-in-development. Usually, people don’t want to enter a home through the bedroom, or to pass through the bathroom on the way to the kitchen. Of course, people’s lifestyles differ; we won’t judge. But almost nobody likes being in a room without exits, the equivalent of the webpage with no links.

Thinking about user flows (“lifestyles”), take each screen from the previous step and define one or more “entry” and “exit” pathways. Entry pathways may be external to our application (directly from the web, from a shared URL, from an app icon on the device), but often they come from other screens within our software; e.g., in a magazine app, the user may enter the *read article* screen from the *article list* screen.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/2.%20Wireframing%2C%20Java%20Variables%2C%20and%20Android%20Studio/pics/flows.webp" alt="flows" width="500"/>

## Wireframes (“Blueprints”)

The third step of wireframing is to actually make the wireframes!

Recall that wireframes are sketches of our apps’ screens in rough approximation to how they will appear in the final product. But while wireframes may be rough in terms of appearance, in terms of concepts, they are fairly precise. Just like an architect can visualize a finished house by looking at a blueprint, another app developer should be able to use our final wireframes to understand **exactly** how our apps’ UI is organized. This is serious progress! Before this step, our app consisted of vague ideas and promises. When this step is complete, our app will have concrete features and a visual layout—everything short of actually working. So grab a pen and some grid paper, or use a convenient drawing app (MS paint anyone?), and let’s get drawing!

To begin, pick a single screen and draw a box representing its approximate aspect ratio. If we are designing for a tablet, a 4:3 or slightly wider (16:9) box can serve as our canvas. Computer displays are generally 16:9 a well, but if we’re designing a web app, keep in mind that not all our users will have their browser in fullscreen mode, so we might need multiple versions of each screen. Smartphone displays are in portrait orientation and range from 16:9 orientation to around 2:1. Make sure the boxes are large enough to fit lots of features and notes!

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/2.%20Wireframing%2C%20Java%20Variables%2C%20and%20Android%20Studio/pics/wireframes.webp" alt="wireframes" width="500"/>

Now we will fill in the UI for each screen, making sure it satisfies the requirements we wrote down in step 1. Let’s see how this might be done, using our familiar example. When we log in to [Codecademy](http://www.codecademy.com/), the first thing we see is the dashboard:

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/2.%20Wireframing%2C%20Java%20Variables%2C%20and%20Android%20Studio/pics/dashboard.webp" alt="dashboard" width="500"/>

The purpose of the Dashboard is to help the user perform their next action on the site, be it a taking lesson, working on a project, or reviewing concepts. The dashboard is a screen, like the ones we’ve been working with in steps 1 and 2. Here’s how the dashboard might have been conceived as a wireframe:

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/2.%20Wireframing%2C%20Java%20Variables%2C%20and%20Android%20Studio/pics/wireframes2.webp" alt="wireframes2" width="500"/>

The wireframe anticipates everything that a Codecademy user might want to be informed about or accomplish on the dashboard, and it includes the UI elements necessary to make that happen. It has all the same elements as the dashboard on the real site: the buttons, the links, and the user’s specific details (their name, their number of badges and streaks), everything is included. The wireframe also has development notes that are not visible on the actual website. For example, it might have arrows pointing away from some of the buttons to indicate user flows.

We’ll want to draw wireframes for all of our app’s screens. Don’t worry, we don’t have to be great artists to achieve this! Like in the example, we can build wireframes using simple geometric shapes:

- A circle can represent a user’s avatar.
- A box acts as a placeholder for an image, icon, or button.
- A rectangle can stand for a text area featuring pertinent information.

It’s amazing how well we can exercise our design aesthetics using such simple symbols. Just don’t forget to write notes about what the shapes mean! It might not be clear to others (or our future selves) that the circle represents an avatar, rather than a logo. Also, add in other explanatory features, such as arrows representing our screens’ “entry” and “exit” pathways.

At this point, our heads are in the clouds, contemplating all the wonderful possibilities of how our app could be. This is where a technical understanding of our development platform can bring us down to earth a bit. Wireframes specify everything an app will do without explaining *how* it will do it. This is similar to how blueprints tell the construction company **what** house to build, without explaining **how** to build a house. In both cases, the plans need to be realistic. We won’t be able to run a computation-intensive VR game in the browser using Javascript, just like we couldn’t support an entire wing of a house on a single column.

How do we know if we’ve created successful wireframes? How does an architect know their house design is good? The decision is aesthetic. In the same way, while app design is a (computer) science, it is also an art. There is no formula for wireframing the perfect user experience. Luckily, one becomes a great artist and a great scientist in the same way: experimentation!

Let’s return to the Codecademy dashboard. The dashboard helps learners see the big picture and motivates them to continue their educational journey. However, the dashboard’s duties can be satisfied in an infinite number of configurations. Let’s experiment with an alternative dashboard wireframe:

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/2.%20Wireframing%2C%20Java%20Variables%2C%20and%20Android%20Studio/pics/wireframes3.webp" alt="wireframes3" width="500"/>

The alternative wireframe features suggested courses front and center, unlike the real dashboard. Is this a good idea? This dashboard wireframe emphasizes the completion percentage of the user’s current course. Does this work to motivate the user to jump back into learning, or does it intimidate them? The ordering of the UI elements is different in this dashboard wireframe. Which order is best?

UI design is a tricky business, and our app’s wireframes will undoubtedly give rise to similar questions. The good news is that we can produce some answers by drawing multiple wireframes for each screen. For now, we won’t worry about creating the perfect design. Instead, we’ll want to focus on quantity over quality here, experimenting with radically different possibilities. Eventually, one of the versions will stand out as the best. Did Frank Lloyd Wright hit on the final design for [Fallingwater](https://en.wikipedia.org/wiki/Fallingwater) on his first try?

## Revision and Next Steps

Take a break! In fact, we’ll allow **one day’s time** before returning to our wireframe project. (This should give us enough time to forget the overwrought analogy between houses and apps.) The creative process tends to create excitement about flawed ideas. What was “brilliant” in the heat of the moment feels silly 24 hours later. We’ll be able to use the benefit of hindsight to revise our wireframes.

This is when we sift through the redundant wireframes. We cut out any designs that clearly won’t work. For each screen, we select designs that satisfy our user flow requirements and please us visually. Even the best wireframes will have some problems. We’ll do some editing until we have a final batch of wireframes that inspire confidence.

And inspire confidence they should, since, at every step, we designed our app with its future users in mind: we conceived of screens that enable users to complete the actions they need to get done, we decided how to best guide the users from one action to another, and we found a way to implement our ideas with a beautiful and intuitively laid-out user interface. One day, our app’s users will thank us. For now, let’s congratulate ourselves on a job well done!

But a complete wireframe is only the beginning of our app design journey. The journey culminates with a product that satisfies the *users*’ requirements and pleases *them* aesthetically. We’ve made an important step towards these final goals. The next step is to bring our wireframes to life so we get can get our app in front of its users, and that means writing code! Depending on which platforms our app is targeting, we will use different languages and development tools. If we’re making a static web page, we may use HTML and CSS. If it’s a dynamic web app, we might check out Javascript and Node.js. Or if we’re planning a smartphone app, we might consider Java and Android Studio.

The possibilities are endless. Go forth and create!