
# lista
List = [64,25,12,22,11,125,58,97,52,19,20,140,92,654,1002,999,872,215,487,123,589,657,623,159,324,24,568,995,555,999,992,991,990,0,127,6,3,144,111,2222,5567,5]
#SeletionSortAlgorithmApplyied
def seletionSort():
	j = 0
	i = 0
	minn = 0
	tamanho = len(List)
	while(j < tamanho - 1):
		minn = j
		i = j + 1
		while(i < tamanho):
			if(List[i] < List[minn]):
				minn = i
			i = i + 1

		if(minn != j):
			aux = List[j]
			List[j] = List[minn]
			List[minn] = aux 
		j = j + 1
seletionSort()

# PrintListFunction 

def imprimir():
	l = 0
	for k in List:
		print (List[l])
		l = l + 1
imprimir()