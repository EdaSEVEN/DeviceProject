public class Phone extends Device{ // fixed the name

    public void call(long phone){
        System.out.println(getBrand() + " " + getModel() + " is calling " + phone);
    }

    public void text(long phone){
        System.out.println(getBrand() + " " + getModel() + " is texting " + phone);
    }

}
/*	2. Create a subclass of Device named Phone:

				Extra Methods:
						call(long phoneNum), text(long phoneNum)*/