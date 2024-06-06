package AAAAAAAAAAA;

public class Split {
    static String split(String vvod) {
        String znac = null;
        if (vvod.indexOf('*') > 0) {
            znac = "\\*";
        } else if (vvod.indexOf('/') > 0) {
            znac = "/";
        } else if (vvod.indexOf('+') > 0) {
            znac = "\\+";
        } else if (vvod.indexOf('-') > 0) {
            znac = "-";
        } else znac = "\\?";

        return znac;
    }
}