# -*- coding: utf-8 -*-
"""
Created on Sat Jan 12 11:30:37 2019

@author: Sahib
"""

class Node():
    
    def __init__(self,val):
        self.left = None
        self.right = None
        self.val = val
        
    
    def insert(self, val):
        if self.val:
            if val < self.val:
                if self.left:
                    self.left.insert(val)
                else:
                    self.left = Node(val)
                    
            elif val > self.val:    
                if self.right:
                    self.right.insert(val)
                else:
                    self.right = Node(val)
        else:            
            self.val = val
    
    def pre_order_traverse(self):
        
        print (self.val)
        
        if self.left:
            self.left.pre_order_traverse()
            
        if self.right:
            self.right.pre_order_traverse()
                
                
root = Node(12)
root.insert(6)
root.insert(14)
root.insert(3)
#root.pre_order_traverse()
