package dk.easv.bll;

import java.util.regex.Pattern;

public class DataProcessorResponsible {
    public String checkAge(String name, int age) {
        if (name == null || name.isEmpty())
            return "Invalid name";
        else if (age < 0) {
            return "Invalid age";
        }
        else if (age < 16) {
            return name + ", you are still too young";
        }
        else if (age < 18) {
            return name + ", you are old enough in Denmark";
        }
        else if (age < 21) {
            return name + ", now you are old enough in the EU";
        }
        else
            return name + ", you are old enough in the US";
    }

    public int checkValidAge(String age) {
        if (age.isEmpty() || !Pattern.matches("[0-9]+", age) )
            return -1;
        else {
            int numAge = Integer.parseInt(age);
            if (numAge < 0 || numAge > 110)
                return -1;
            else
                return numAge;
        }
    }
}
