public class Worker_my_program {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("id:%d fn:%s ln:%s s:%d", id, firstName, lastName, salary);
        //определяем шаблон вывода информации для метода toString
    }

    //меняем поведения сравнивания сущностей


    @Override
    public boolean equals(Object obj) {
       Worker t = (Worker) obj;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        return id;
        // здесь мы переопределяем возврат хэшкода и вместо него возвращаем в данном случае id
    }
}
