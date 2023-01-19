package GB_Java_API_base.Shared_repo.Lections.L_01.Project_1;

// будем вызывать функцию из другого файла
public class func1_program {
    public static void main(String[] args) {
        //перед методом надо прописать имя файла из которого будем вызывать функцию
        func2_functions.sayHi();
    }
}
