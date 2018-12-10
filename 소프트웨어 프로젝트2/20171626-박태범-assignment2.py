n = int(input("enter a number: "))
ans = 1

while n != -1:
	if n >= 0:
		while n >=0:
			for i in range(1, n+1):
				ans = ans * i
			print(n,"! = ",ans)
			ans = 1
			n = int(input('enter a number: '))
	else:
		print('Error')
		ans = 1
		n = int(input('enter a number: '))
