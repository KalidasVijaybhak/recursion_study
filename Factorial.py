#[on_true] if [expression] else [on_false] 


def Factorial(inp):
    return 1 if inp == 0 else inp*Factorial(inp-1)
    
    
print(Factorial(5))
