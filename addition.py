x =10
y=20
A= x+y
print("sum of x and y is:",A)


def maximum(x,y):
    if x>=y:
        return x
    else:
        return y
print("Maximum number is", maximum(x,y))


def factorial(x):
    return 1 if(x==1 or x==0) else x * factorial(x - 1)
print("Factorial of ",x,"is ",factorial(x))



def simple_interest(P,T,R,S):
    P = int(input("Enter the principal amount :"))
    T = int(input("Enter the time period :"))
    R = int(input("Enter the rate of interest :"))
    S =(P * T * R)/100
print("The Simple Interest is:",S);

    





