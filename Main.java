import repository.RepositoryImpl;
import service.ServiceImpl;
import view.TerminalViewImpl;

public class Main {
    public static void main(String[] args) {
        RepositoryImpl repository = new RepositoryImpl();
        ServiceImpl service = new ServiceImpl(repository);
        TerminalViewImpl view = new TerminalViewImpl(service);
        view.handleInput();
    }
}
