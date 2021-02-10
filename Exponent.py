def multiply(m,n):
    return 1 if  (n==0) else m * multiply(m,n-1)
    
    
    
print(multiply(5,0))    
