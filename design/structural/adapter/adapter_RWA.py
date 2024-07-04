########## Adapter Real Word Analogy ##########
"""
Adapter
"""
import random
class Kingdom :
    
    def __init__(self) : 
        self.name = ""

    """
    Sometimes the return values of a functions muste be translated
    """
    def harvest(self) : 
        pass

    """
    Sometimes the functions must be rewiered entirely
    """
    def war(self) :
        pass

class MainLand(Kingdom) : 

    def __init__(self) : 
        self.name = "Main Landers"

    def harvest (self) -> str : 
        print(f"{self.name} : Yes, milord.")
        return ("yes milord")

    def war (self) -> str : 
        print(f"{self.name} : Yes, milord.")
        return ("yes milord")

class SnakeLand : 

    def __init__(self) : 
        self.name = "Snake Landers"
        self.priest_approval = False

    def harvest (self) -> str : 
        print(f"{self.name} : yes_milord")
        return ("yes_milord")

    def war (self) -> str : 
        if self.priest_approval == True :
            print(f"{self.name} : yes_milord")
            self.priest_approval = False
            return ("yes_milord")
        else : 
            print(f"{self.name} : you_have_to_convince_our_priest")
            return ("no_milord")

    def priest(self) -> str :
        print("Priest : we give your our approval")
        self.priest_approval = True


class  KingCommunication :

    def __init__ (self, kingdoms) :
        self.name = "King"
        self.kingdoms = kingdoms

    def harvest(self) :
        for kingdom in self.kingdoms : 
            if kingdom.harvest() == "yes milord" :
                print(f"{self.name} : Good")

            else : 
                print(f"{self.name} What ??")


    def war(self) :
        for kingdom in self.kingdoms : 
            if kingdom.war() == "yes milord" :
                print(f"{self.name} : Good")

            else : 
                print(f"{self.name} What ??")


class SnakeLandAdapter(Kingdom):

    def __init__(self, snake_land):
        self.snake_land = snake_land
        self.name = snake_land.name
        self.translator_name = "Snake Translator"

    def harvest(self) -> str:
        response = self.snake_land.harvest()
        if response == "yes_milord":
            print(f"{self.translator_name} : Yes, milord.")
            return "yes milord"
        return response

    def war(self) -> str:
        self.snake_land.priest()
        response = self.snake_land.harvest()
        if response == "yes_milord":
            print(f"{self.translator_name} : Yes, milord.")
            return "yes milord"
        return response


kingsCommunucation_entity = KingCommunication([
    MainLand(),
    SnakeLandAdapter(SnakeLand())
    ])

kingsCommunucation_entity.war()