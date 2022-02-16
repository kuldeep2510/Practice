from sklearn import tree
from sklearn.datasets import load_iris
from sklearn.metrics import accuracy_score
from sklearn.neighbors import KNeighborsClassifier
from sklearn.model_selection import train_test_split

def CalculateAccuracyDecisionTree():
      iris=load_iris()

      data=iris.data
      target=iris.target

      data_train,data_test,target_train,target_test=train_test_split(data,target,test_size=0.5)


      classifier=tree.DecisionTreeClassifier()

      classifier.fit(data_train,target_train)

      predictions=classifier.predict(data_test)

      Accu

