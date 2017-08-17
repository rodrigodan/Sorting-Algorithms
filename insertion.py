List = [64,25,12,22,11,125,58,97,52,19,20,140,92,654,1002,999,872,215,487,123,589,657,623,159,324,24,568,995,555,999,992,991,990,0,127,6,3,144,111,2222,5567,5]
#sorted and unsorted list
def seletionSort():
	sIndicator = 0 #define the quantity of element in list is sorted
	usIndicator = 0 #define the first element of one unsorted list in the vector
	i = 0
	tamanho = len(List) #the vector size
	while(sIndicator < tamanho): #loop in the complete list
		
		usIndicator = sIndicator # the first usIndicator is visible 0
		elemento = List[usIndicator] #i get the element that i wish place it in sorted list

		while(usIndicator > 0 and List[usIndicator - 1] > elemento): #creating the sorted list
			List[usIndicator]  = List[usIndicator - 1]
			usIndicator = usIndicator - 1

		List[usIndicator] = elemento
		sIndicator = sIndicator + 1
seletionSort()

# PrintListFunction 

def imprimir():
	l = 0
	for k in List:
		print (List[l])
		l = l + 1
imprimir()
			

