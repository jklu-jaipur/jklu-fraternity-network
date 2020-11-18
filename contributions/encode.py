import numpy
name='computer science'
matrix = numpy.array([[3,13,21,5,0,3,5,3],[15,16,20,18,19,9,14,5]])
print('A =')
print(matrix)
m_matrix=numpy.array([[3,1],[1,0]])
print('a =')
print(m_matrix)
mult_matrix=numpy.dot(m_matrix,matrix )
print('A.a =')
print(mult_matrix)
print( 'it is the encoded matrix')