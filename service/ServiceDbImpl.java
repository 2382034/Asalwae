package service;

import repository.Repository;

public class ServiceDbImpl extends ServiceImpl {
    public ServiceDbImpl(Repository repository) {
        super(repository);
    }

    // Additional database-specific logic can go here
}
