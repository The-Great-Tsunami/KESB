###Decorator

def document_info(func):
	def new_function(*args, **kwargs):
		print("running function:", func.__name__)
		print('positional arguments:', args)
		print('keyward arguments:', kwargs)
		result = func(*args, **kwargs)
		print('Result:', result)
		return result
	return new_function

def squares_it(func):
	def new_function(*args, **kwargs):
		result = func(*args, **kwargs)
		return result * result
	return new_function
##자동

@document_info
@squares_it
def add_ints(a, b):
	return a + b

@document_info
@squares_it
def sub_ints(x,y):
	return x - y