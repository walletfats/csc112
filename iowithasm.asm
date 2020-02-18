.text

.globl main


.main: 
		#Display msg1
		li $v0, 4
		la $a0, msg1
		syscall
		
		#Read Int 
		li $v0, 5
		
		#Display First Int
		li $v0, 1
		la $a0, msg1 

.data 

msg1: .asciiz "Integer: "
msg2: .asciiz "Integer: "
output: .asciiz "+"
output2: .asciiz " = sum"