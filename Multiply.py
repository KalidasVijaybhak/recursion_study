def multiply(m,n):
    return 0 if m==0 or n==0 else m + multiply(m,n-1)
    
    
    
print(multiply(5,2))    
