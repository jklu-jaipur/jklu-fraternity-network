import numpy
matrix_1=mult_matrix
print('A.a')
print(matrix_1)
inverse_a=numpy.array([[0,1],[1,-3]])
print('a-1')
print(inverse_a)
multy_matrix=numpy.dot(inverse_a,matrix_1)
print('decoded matrix =')
print(multy_matrix)