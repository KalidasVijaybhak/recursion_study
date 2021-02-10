def getSum(l):
   return 0 if l == [] else l[0] + getSum(l[1:]) 
   
   
l = [1,2,3,4,5]
print(getSum(l))
