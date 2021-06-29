# Queue and BFS

One common application of Breadth-first Search (BFS) is to find the shortest path from the root node to the target node. In this article, we provide an example to explain how queue is applied in a BFS algorithm step by step.

### An Example

Here we provide an example to show how BFS is used to find the shortest path between the root node ```A``` and the target node ```G```.

<img src="https://user-images.githubusercontent.com/19383145/123736409-0dd58a80-d86f-11eb-8a74-7e1672cc7a06.png" alt="BFS1" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/123736514-3e1d2900-d86f-11eb-9fc0-31d5dfb26fad.png" alt="BFS2" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/123736752-b71c8080-d86f-11eb-828c-067cf4a9af4d.png" alt="BFS3" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/123736810-d3202200-d86f-11eb-8a0d-31eb8e660d04.png" alt="BFS4" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/123736884-fea30c80-d86f-11eb-9e3e-dcd15b8ac0bb.png" alt="BFS5" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/123736934-111d4600-d870-11eb-86c1-afa6cf713199.png" alt="BFS6" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/123736981-2a25f700-d870-11eb-972b-a82e1a54f793.png" alt="BFS7" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/123737032-41fd7b00-d870-11eb-9c4d-121ba10d8a60.png" alt="BFS8" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/123737080-58a3d200-d870-11eb-8b4b-4378f2247111.png" alt="BFS9" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/123737133-6eb19280-d870-11eb-879f-3be35381a8d0.png" alt="BFS10" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/123737189-86891680-d870-11eb-8dcc-0405f691071d.png" alt="BFS11" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/123737246-9f91c780-d870-11eb-8029-652b00c2b73b.png" alt="BFS12" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/123737337-cbad4880-d870-11eb-8563-8657e7dbfb2e.png" alt="BFS13" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/123737380-df58af00-d870-11eb-9196-50ec1080f92d.png" alt="BFS14" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/123737478-ff886e00-d870-11eb-8f36-747e49d38301.png" alt="BFS15" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/123737518-13cc6b00-d871-11eb-8d35-410ad797a81c.png" alt="BFS16" width="500"/>

### Insights

After watching the animation above, let's answer the following questions:

1. What is the processing order of the nodes?

In the first round, we process the root node. In the second round, we process the nodes next to the root node; in the third round, we process the nodes which are two steps from the root node; so on and so forth.

Similar to tree's level-order traversal, ```the nodes closer to the root node will be traversed earlier```.

If a node ```X``` is added to the queue in the ```kth``` round, the length of the shortest path between the root node and ```X``` is exactly ```k```. That is to say, you are already in the shortest path the first time you find the target node.

2. What is the enqueue and dequeue order of the queue?

As shown in the animation above, we first enqueue the root node. Then in each round, we process the nodes which are already in the queue one by one and add all their neighbors to the queue. It is worth noting that the newly-added nodes ```will not``` be traversed immediately but will be processed in the next round.

The processing order of the nodes is the ```exact same order``` as how they were added to the queue, which is First-in-First-out (FIFO). That's why we use a queue in BFS.

## BFS - Template

Previously, we have already introduced two main scenarios of using BFS: ```do traversal``` or ```find the shortest path```. Typically, it happens in a tree or a graph. As we mentioned in the chapter description, BFS can also be used in more abstract scenarios.

In this repo, we will provide you with a template. Then, we provide some exercise after this article for practice.
> It will be important to determine the nodes and the edges before doing BFS in a specific question. Typically, the node will be an actual node or a status while the edge will be an actual edge or a possible transition.

### Template I

