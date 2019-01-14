
from collections import deque

queue = deque(["Eric", "John", "Michael"])

queue.append("Terry")
# Eric", "John", "Michael","Terry"

queue.append("Graham")
# Eric", "John", "Michael","Terry","Graham"

queue.popleft()
# 'Eric'
# The first to arrive now leaves

queue.popleft()
# The second to arrive now leaves
# 'John'

print (queue)                           # Remaining queue in order of arrival
# Output-> deque(['Michael', 'Terry', 'Graham'])
