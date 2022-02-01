from unittest import result
from sklearn import tree

def MachineLearning(weight,surface):
      BallFeatures=[[35,1],[47,1],[90,0],[30,1],[92,0],[35,1],[96,0],[43,1],[110,0],[35,1],[95,0]] 
      Names=[1,1,2,1,2,1,2,1,2,1,2]

      clf=tree.DecisionTreeClassifier()
      clf=clf.fit(BallFeatures,Names)

      result=clf.predict([[weight,surface]])

      if result==1:
            print("your object is look like tennis ball")

      elif result==2:
            print("your object is look like cricket ball")

def main():
      print("Enter weight of object")
      weight=input()

      print("what is surface type ofobject rough or smooth")
      surface=input()

      if surface.lower()=="rough":
            surface=1

      elif surface.lower()=="smooth":
            surface=0
      else:
            print("wrong input")
            exit()

      MachineLearning(weight,surface)


if __name__=="__main__":
      main()