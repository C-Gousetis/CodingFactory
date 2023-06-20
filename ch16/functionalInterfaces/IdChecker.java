package gr.aueb.cf.ch16.functionalInterfaces;

@FunctionalInterface
public interface IdChecker {

    /**
     * Checks for specific student ids
     * @param student
     *      the {@link Student} instance
     * @return
     *      true if the id of the student is valid baed on the predicate
     *      otherwise false
     */
    boolean checkId(Student student); // predicate

}
