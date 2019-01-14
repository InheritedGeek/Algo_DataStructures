
# http://www.geeksforgeeks.org/level-order-tree-traversal/
# Recursive Python program for level order traversal of Binary Tree

# A node structure
class Node:

    # A utility function to create a new node
    def __init__(self, key):
        self.data = key
        self.left = "null"
        self.right = "null"


# Function to  print level order traversal of tree
def printLevelOrder(root):
    # print (root)
    h = height(root)
    print ("height",h)
    for i in range(1, h+1):
        printGivenLevel(root, i)


# Print nodes at a given level
def printGivenLevel(root , level):
    if root is None:
        return

    if level == 1:
        print ("%d" %(root.data)),
    elif level > 1 :
        printGivenLevel(root.left , level-1)
        printGivenLevel(root.right , level-1)


""" Compute the height of a tree--the number of nodes
    along the longest path from the root node down to
    the farthest leaf node
"""
def height(node):
    if node == "null":
        return 0

    else :

        # lheight & rheiht will keep looping until it's node equals 0
        # ie it's value will be increasing by 1 for each recursion/loop
        # ie if root.left/root.right equals 1, then height will be atleast 2.

        lheight = height(node.left)
        rheight = height(node.right)

        #Use the larger one
        # Adding '1' for the root node
        if lheight >= rheight :
            return lheight+1
        else:
            return rheight+1

# Driver program to test above function
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.right = Node(4)
root.left.left = Node(5)

print ("Level order traversal of binary tree is -")
printLevelOrder(root)
