# filereader
### by Napasai Sutthichutipong
Read to String : Read 53746 in 0.860360 sec. <br />
Read to StringBuilder : Read 52539 in 0.014339 sec. <br />
Read by BufferedReader : Read 52539 in 0.027684 sec. <br />

# Explain 

### Why read to String slower than read to StringBuilder? <br />
Because String is immutable so it will create new String. StringBuilder is mutable so it will append old String with new String. <br />

### Why read file by using InputStreamReader slower than read file by using BufferedReader? <br />
Because InputStreamReader read 1 character per time but BufferedReadder read read 1 line per time. <br />
