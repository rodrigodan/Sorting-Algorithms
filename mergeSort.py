lista = [9,8,7,6,5,4,3,2,1]
a = 0
b = 8

def merge(p,q,r,v):
	i = p
	j = q
	k = 0
	w = range(r-p)

	while(i < q	and j < r):
		if(v[i] <= v[j]):
			w[k] = v[i]
			k += 1
			i += 1
		else:
			w[k] = v[j]
			k += 1
			j += 1
	while(i < q):
		w[k] = v[i]
		k += 1
		i += 1
	
	while(j < r):
		w[k] = v[j]
		k += 1
		j += 1

	i = p

	while(i < r):
		v[i] = w[i - p]
		i += 1



def mergeSort(p,r,v):
	q = 0
	if(p < r-1):
		q = (int)((p + r) / 2)
		mergeSort(p,q,v)
		mergeSort(q,r,v)
		merge(p,q,r,v)
mergeSort(0,9,lista)

def imprimir():
	l = 0
	for k in lista:
		print (lista[l])
		l = l + 1
imprimir()
