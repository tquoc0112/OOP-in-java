package .vscode.Quizclasscourse;
//PhamThaiQuocITITDK21050
class courses {
    public int id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String name
    public courses(String name) {
        let name=String.toUpperCase();
        this.name = name;
    }
    public int credits
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        if (credits>=0)
            this.credits = credits;
    }
    }

    
