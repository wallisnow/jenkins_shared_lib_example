def call(String name = "foo", String course = "bar") {
    def st = new main.groovy.wj.Student(name, course)
    st.showStudent()
}