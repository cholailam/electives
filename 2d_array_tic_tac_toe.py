arr = [ ['-','-','-'],
        ['-','-','-'],
        ['-','-','-']]
 
game_over = False
 
 
i = 0
last_played = 'O'
 
while i != -1 and game_over == False:
    i,j = map(int, input('Enter row and column (1-3). enter -1 -1 to quit').split())
    if i == -1:
        break                               #break the loop and quit
   
    if i > 3 or j > 3:
        print('Error: should be within the range! ')
        continue                                #by-pass this iteration
    elif  arr[i-1][j-1] != '-':
        print('Error: already occupied! ')
        continue    
   
    if last_played == 'O':
       last_played = 'X'
       print('Player X played:')
    else:
       last_played = 'O'
       print('Player O played:')
    arr[i-1][j-1] = last_played
       
   
    #checking if anyone has won
    for i in range(3):          #case 1: horizontal
        if arr[i][0] != '-' and (arr[i][0] == arr[i][1] and arr[i][1] == arr[i][2]):
            game_over = True
           
    for j in range(3):          #case 2: vertical
        if arr[0][j] != '-' and (arr[0][j] == arr[1][j] and arr[1][j] == arr[2][j]):
            game_over = True
   
    if arr[1][1] != '-' and ((arr[0][0] == arr[1][1] == arr[2][2]) or (arr[0][2] == arr[1][1] == arr[2][0]) ):                   #case 3: oblique
        game_over = True

    sum=0                       #check if the array is full (no ‘-’)
    for i in range(3):
        sum+=arr[i].count('-')
    if sum==0:
        i=-1

    #print the 2D array
    for a in range(3):
        for b in range(3):
            print(arr[a][b], end=' ')
        print()


if game_over:
    print('Game Over -- winner:',last_played)
else:
    print('Game Over -- Draw')

