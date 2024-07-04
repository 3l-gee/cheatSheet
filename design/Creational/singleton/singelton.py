########## Singelton Class ##########
"""
Singelton as a Class

PROS : 
* Simple

CONS :
* Violates Single Responsibility Principle
* Limited scalability
"""
# Code :
from typing import Any

class SingletonClass:
    _instance = None
    _is_initialized = False


    @classmethod
    def __new__(cls, *args, **kwargs) -> 'SingletonClass':
        if cls._instance is None:
            cls._instance = super(SingletonClass, cls).__new__(cls)
        return cls._instance


    def __init__(self, value : Any = None) -> None:
        if not self._is_initialized:
            self.value = value
            self._is_initialized = True


    def __str__(self) -> str:
        return str(self.value)


# Usage:
s1 = SingletonClass(42)
print(type(s1), s1)           # Output: 42

s2 = SingletonClass()
print(type(s2), s2)           # Output: 42 (unchanged)

s3 = SingletonClass(543) # Will always output 42
print(type(s3), s3)           # Output: 42 (unchanged)

print(s1 == s2)     # Output: True (s1 and s2 are the same instance)

############### Singelton Decorator ##########
"""
Singelton as a decorator

PROS : 
* Lazy initialization
* Cleaner syntax

CONS :
* Increased complexity
"""
# Code :
def singleton(cls):
    instances = {}


    def get_instance(*args, **kwargs):
        if cls not in instances:
            instances[cls] = cls(*args, **kwargs)
        return instances[cls]

    return get_instance

@singleton
class SingeltonDecorated:
    def __init__(self, value):
        self.value = value


    def __str__(self) -> str:
        return str(self.value)


# Usage:
s1 = SingeltonDecorated(42)
print(type(s1), s1)           # Output: 42

s2 = SingeltonDecorated()
print(type(s2), s2)           # Output: 42 (unchanged)

s3 = SingeltonDecorated(543) # Will always output 42
print(type(s3), s3)           # Output: 42 (unchanged)

print(s1 == s2)     # Output: True (s1 and s2 are the same instance)

########## Singelton Metaclass ##########
"""
Singelton as a Metaclass

PROS : 
* Cleaner syntax

CONS :
* Increased complexity syntax 
* Increased complexity inheritance
"""
# Code :
from typing import Any

class Metaclass(type):
    _instances = {}


    def __call__(cls, *args: Any, **kwargs: Any) -> Any:
        if cls not in cls._instances:
            instance = super().__call__(*args, **kwargs)
            cls._instances[cls] = instance
        return cls._instances[cls]

class SingletonMetaclass(metaclass = Metaclass):


    def __init__(self, value: Any = None) -> None:
        self.value = value


    def __str__(self) -> str:
        return str(self.value)


# Usage:
s1 = SingletonMetaclass(42)
print(type(s1), s1)           # Output: 42

s2 = SingletonMetaclass()
print(type(s2), s3)           # Output: 42 (unchanged)

s3 = SingletonMetaclass(543) # Will always output 42
print(type(s3), s3)           # Output: 42 (unchanged)

print(s1 == s2)     # Output: True (s1 and s2 are the same instance)

########## Singelton Class Multithreaded ##########

# Code :
from typing import Any
import threading

class MultithreadedSingletonClass:
    _instance = None
    _is_initialized = False
    _lock = threading.Lock()

    @classmethod
    def __new__(cls, *args, **kwargs) -> 'MultithreadedSingletonClass':
        if cls._instance is None:
            with cls._lock:
                if cls._instance is None:
                    cls._instance = super(MultithreadedSingletonClass, cls).__new__(cls)
        return cls._instance

    def __init__(self, value: Any = None) -> None:
        if not self._is_initialized:
            self.value = value
            self._is_initialized = True

    def __str__(self) -> str:
        return str(self.value)

# Usage:
import threading

def create_instance_and_print_value(value):
    instance = MultithreadedSingletonClass(value)
    print(type(instance), instance)

# Create threads
threads = []
data = [42, None, 543]
for val in data:
    for _ in range(5):
        t = threading.Thread(target=create_instance_and_print_value, args=(val,))
        threads.append(t)

# Start threads
for t in threads:
    t.start()

# Join threads
for t in threads:
    t.join()