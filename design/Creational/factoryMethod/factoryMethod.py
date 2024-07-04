########## Factory Methode Class ##########
"""
Factory Methode
"""
from abc import ABC, abstractmethod
from typing import Any
from enum import Enum


class Creator(ABC) : 

    def __init__(self) -> None:
        self.product = self.ABS_init()

    



    
class Prodcut(ABC) : 

    def __init__(self) -> None:
        self.name = "prodcut"

    def operation(self) -> str : 
        print(self.name)

    

def User(creator : Creator) -> None
    creator.build()

