import main.groovy

def call(String name = "foo", String course = "bar") {
    def st = new com.wj.Student(name, course)
    st.showStudent()
}