import com.wj.Student

def call(String name = "foo", String course = "bar") {
    def st = new Student('name': name, 'course': course)
    print "This is:" + st.name + st.course
}
