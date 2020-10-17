class MyQueue(object):
    def __init__(self):
        self.stack_pri = []
        self.stack_sec = []

    def transfer(self):
        if len(self.stack_sec) == 0:
            for i in self.stack_pri:
                self.stack_sec.insert(0, i)
            self.stack_pri.clear()
        return

    def peek(self):
        self.transfer()
        return self.stack_sec[0]

    def pop(self):
        self.transfer()
        del self.stack_sec[0]

    def put(self, value):
        self.stack_pri.insert(0, value)


queue = MyQueue()
t = int(input())
for line in range(t):
    values = map(int, input().split())
    values = list(values)
    if values[0] == 1:
        queue.put(values[1])
    elif values[0] == 2:
        queue.pop()
    else:
        print(queue.peek())
