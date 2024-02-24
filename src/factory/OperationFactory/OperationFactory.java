package factory.OperationFactory;


import factory.Operation.InvalidOperationException;
import factory.Operation.Operation;

public interface OperationFactory {
    Operation getInstance(int choice) throws InvalidOperationException;
}
