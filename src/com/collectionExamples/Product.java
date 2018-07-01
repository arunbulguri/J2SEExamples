package com.collectionExamples;

public class Product {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pbrand == null) ? 0 : pbrand.hashCode());
		result = prime * result + pid;
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (pbrand == null) {
			if (other.pbrand != null)
				return false;
		} else if (!pbrand.equals(other.pbrand))
			return false;
		if (pid != other.pid)
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		return true;
	}
	private int pid ;
	private String pname ;
	private String pbrand ;
	
	
	
	public Product(int pid, String pname, String pbrand){
		this.pid = pid;
		this.pname = pname;
		this.pbrand = pbrand;
		
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public void setPID(int pid){
		this.pid = pid;
		}
	
	public int getPID(){
		return pid;
		
	}
	

public void setPNAME(String pname){
	this.pname = pname;
	}
public String getPNAME(){
	return pname;
}

public void setPBRAND(String pbrand){
	this.pbrand = pbrand;
	}
public String getPBRAND(){
	return pbrand;
	
}
	
/*public boolean equals(Object o) {

    if (o == this) return true;
    if (!(o instanceof User)) {
        return false;
    }

    User user = (User) o;

    return user.name.equals(name) &&
            user.age == age &&
            user.passport.equals(passport);
}

//Idea from effective Java : Item 9
@Override
public int hashCode() {
    int result = 17;
    result = 31 * result + name.hashCode();
    result = 31 * result + age;
    result = 31 * result + passport.hashCode();
    return result;
}
*/
}





