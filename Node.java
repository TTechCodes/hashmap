package hash;

class Node {
private String[]user = new String[4];

//set First Name
protected void setFN(String string) {user[0]=string;}

//get First Name
protected String getFN() {return user[0];}

//set Last Name
protected void setLN(String string) {user[1]=string;}

//get Last Name
protected String getLN() {return user[1];}

//set User Name
protected void setUN(String string) {user[2]=string;}

//get user Name
protected String getUN() {return user[2];}

//set Password
protected void setPW(String string) {user[3]=string;}

//get Password
protected String getPW() {return user[3];}

}
