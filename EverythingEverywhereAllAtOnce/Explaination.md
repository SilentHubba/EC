All three functions are in the code.

To convert an adjacency list into an adjacency matrix, first create an n by n matrix where n is the number of nodes. Then, for every node, fill in its corresponding row with its adjacency list. 

Pseudocode:
nodeQueue = queue with first node
nodeDictionary = empty
Visited = empty
Index = 0
while nodeQueue is not empty
	currentNode = nodeQueue.remove()
	add currentNode and index to nodeDictionary
Increment index
	for adjacentNode in currentNode.adjacencyList
if adjacentNode is not in visited
add adjacentNode to nodeQueue
add adjacentNode to visited
matrix = index+1 by index+1 size matrix
for node in nodeDictionary 
for adjacentNode in node.adjacencyList
matrix[node.index][adjacentNode.index] = 1

return matrix, nodeDictionary // for mapping the nodes


To convert an adjacency matrix into an adjacency list, create a node for each row in the matrix. Then, in each node, create an edge list with edges for every element in the row that is not infinity/negative infinity. 

nodeList = empty list of nodes
for row in matrix
	add new Node to nodeList at the index of row

for row in matrix
currentNode = nodeList[row]
for element in row
if element == 1
add the element to the currentNode edge list 
add currentNode to nodeList 
return the first element of nodeList //or whatever node from the list

To reverse the direction of each edge, create a list of visited edges. Then, traverse the graph and flip each edge while adding it to the list of visited edges. Make a special case for bidirectional edges where not flipping them and adding them to the visited list is enough. If the graph is in a matrix form however, just transpose the matrix.

return matrix.transpose()

Or

nodeQueue = queue with first node
Visited = empty
while nodeQueue is not empty
	currentNode = nodeQueue.remove()
	for edge in currentNode.adjacencyList
if edge is not in visited
add adjacentNode to nodeQueue
add edge to visited // make sure the edge is how it will appear after it is flipped or it will flip twice
flip the direction of the edge 

return the first node
