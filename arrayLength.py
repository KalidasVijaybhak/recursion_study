def length(l):
    return 0 if l == [] else 1+length(l[1:])
    
    
    
l = ['1','2','3','4','5']

print(length(l))
