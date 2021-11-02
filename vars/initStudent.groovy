import main.groovy.com.wj.Student

def call(String name = "foo", String course = "bar") {
    def st = new Student(name, course)
    st.showStudent()
}