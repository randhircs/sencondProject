Agenda
1>Steps that we followed.
1>Store data with business key like Bill, Speed, Network etc  which helps to check whether the feedback is neutral.
2>Store data with set of regular expression which will decide that feedback is negative . If a statement is following that trend.
3>If the feedback is non neutral and non negative  then default system will consider this as positive feedback.
To accomplish this below are the steps we followed.
 1>Read file one line at a time. 
     a>Parse the line to check whether it is neutral. Logic is check whether line is containing any business related key word.
     b> If it contains then check for the negative.
             Logic to check for the negative feedback
                     p>Check whether line contains any line starts with Who, Where,Nothing etc .If it is yes then consider it as negative. 
                      q>Check whether the feedback contains any line with more than three words written in caps. If it is yes then consider it as negative. 
                     r>If comments contains line starts with but. Then concentrate statement after that but. Reason is some users will start with positive and then they will give actual comments after but ,however etc. 
                   s>  Check whether line contains digit followed by employees or workers or agents(5 agents or 6 workers). Then  consider this as negative. 
                   t>
Logic to check neutral feedback.
2>Once parsing is done and feedback is categorized then write it in output file. 
3>Repeat this process till the file ends.








List of patterns which will determine the feedback is negative .These are based on analysis done on real time feedback data got from customers. 
// reg ex to add in list

[0-9][0-9]*\\stimes		[0-9][0-9]*\\s agents
time out 				no response
no longer				forever
donot					don't
don’t  				do not
did not				dint
didn’t				doesnot
does not				doesn't
does nothing			do nothing
unable to				slow
error					concern
not good				not work
not fast				slow
problem				awful
cancel				can't
can not				cannot
could not				couldn't 
unavailable				never
empty					not proceed
couldn't				proceed
pain					waste of time
impossible				taking over
keep trying				keep loading
ridiculous				froze 
frozen
freeze				horrible
	
List of Business key words

network
		internet
		service
		fios
		mobile
		product
		circuit
		money
		bill
		payment
		phone
		invoice
		price
		ordering
		order
		hd
		tv
		fios
		speed 	
technician
		
 
