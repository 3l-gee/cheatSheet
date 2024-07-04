########## Factory Methode Class Real World Analogy ##########
"""
Blacksmith Analogy

"""
from typing import Any
from abc import ABC, abstractmethod

class Forge(ABC): 
    METAL = None
    SHARPEN = None
    LEATHER = None

    def __init__(self): 
        self.item = None

    @abstractmethod
    def ABS_build(self):
        pass

    def build(self): 
        self.item = self.ABS_build()

    @abstractmethod
    def ABS_use(self):
        pass

    def use(self): 
        self.ABS_use()


class SwordForging(Forge):
    METAL = "Steel"
    SHARPEN = "50"
    LEATHER = None

    def ABS_build(self):
        item = Sword(self.METAL, self.SHARPEN, self.LEATHER)
        item.build()
        return item

    def ABS_use(self):
        if self.item:
            self.item.use()


class AxeForging(Forge):
    METAL = "Steel"
    SHARPEN = "25"
    LEATHER = None

    def ABS_build(self):
        item = Axe(self.METAL, self.SHARPEN, self.LEATHER)
        item.build()
        return item

    def ABS_use(self):
        if self.item:
            self.item.use()


class Item(ABC):
    def __init__(self, metal, sharpen, leather):
        self.item = ""
        self.metal = metal
        self.sharpen = sharpen
        self.leather = leather

    @abstractmethod
    def ABS_build(self):
        pass

    def build(self):
        self.item = self.ABS_build()
        print(f"""
Build Finsihed
Material   : {self.metal}
Sharpened  : {self.sharpen}
Leather    : {self.leather}
Item       : {self.item}
        """)

    @abstractmethod
    def ABS_use(self):
        pass

    def use(self):
        print("How to use it !")
        self.ABS_use()



class Sword(Item) :
    def ABS_build(self):
        print("add handel")
        self.item += "-|"
        print(self.item)

        print("add blade")
        self.item += "==="
        print(self.item)

        print("sharpen blade")
        self.item = self.item[:-1]
        self.item += ">"
        print(self.item)

        return self.item

    def ABS_use(self):
        print(self.item)
        print("    ", self.item)
        print(self.item)

class Axe(Item) : 
    def ABS_build(self):
        print("add handel")
        self.item += " o====="
        print(self.item)

        print("add blade")
        self.item += "()"
        print(self.item)

        print("add sharpen")
        self.item += "\n.      W"
        print(self.item)

    
    def ABS_use(self):
        print(self.item)


def Blacksmith(forge: Forge) -> None:
    forge_instance = forge()
    forge_instance.build()
    forge_instance.use()


Blacksmith(AxeForging)
