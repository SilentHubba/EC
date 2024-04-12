Kahn's and BFS are pretty much the same algorithm, so I refer to them both as Kahn's.

Both algorithms start by finding all nodes with an in-degree of 0 and putting them in a queue (Kahn's) or stack (DFS). From there, the algorithms differ.

Kahn's:
Keep a list of each nodes' indegrees. Remove a node from the queue. Add it to the sorted list. For each node in its adjacency list, reduce their in-degree by 1. If that causes any of them to reach an in-degree of 0, add that node to the queue. Loop through until the queue is empty. Then, return the list.

DFS:
Keep a list of visited nodes. Check the top node on the stack. If it has any unvisited nodes in its adjacency list, add those to the stack. If it doesn't add the node to the end of the final sorted list. Loop through this until the stack is empty.
