class Badge {
    public String print(Integer id, String name, String department) {
        String res = "";
        
        if (id != null) {
             res += "[" + id + "] - ";
        }
        res += name;
        if (department == null) {
            res += " - OWNER";
        } else {
            res += " - " + department.toUpperCase();
        }
        return res;
    }
}
