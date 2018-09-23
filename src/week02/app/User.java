package week02.app;

/**
 * @author Emmanuel Cruz
 */

public class User {

    /** First Name variable */
    private String m_firstName;

    /** Last Name variable */
    private String m_lastName;

    /** User ID variable */
    private long m_userId;

    /**
     * Constructor
     */
    public User() {

    }

    /**
     * Constructor for User Class
     * @param m_userId parameter for UserId
     * @param m_firstName parameter for First Name
     * @param m_lastName parameter for Last Name
     */
    public User(long m_userId, String m_firstName, String m_lastName) {
        this.m_firstName = m_firstName;
        this.m_lastName = m_lastName;
        this.m_userId = m_userId;
    }

    /**
     * Method compares userId whether if it's equal, null or not equal
     * @param obj parameter identifies the object and value being passed on to compare.
     * @return boolean
     */
    public boolean equals(Object obj) {

        if (obj instanceof User) {
            User u=(User) obj;
            return getUserId() == u.getUserId();
        }

        return false;

    }

    /**
     * This method returns a string.
     * @return String this method returns a string
     *
     */
    public String getFirstName() {
        return this.m_firstName;
    }

    /**
     * This method returns a string.
     * @return String this method returns a string
     *
     */
    public String getLastName() {
        return this.m_lastName;
    }

    /**
     * This method returns a long value for UserId.
     * @return long this method returns a long value
     *
     */
    public long getUserId() {
        return this.m_userId;
    }

    /**
     * Method doesn't return anything.
     * @param m_firstName parameter to set First Name
     *
     */
    public void setFirstName(String m_firstName) {
        this.m_firstName = m_firstName;
    }

    /**
     * Method doesn't return anything.
     * @param m_lastName parameter to set Last Name
     *
     */
    public void setLastName(String m_lastName) {
        this.m_lastName = m_lastName;
    }

    /**
     * Method doesn't return anything.
     * @param user_id parameter to set Last Name
     *
     */
    public void setUserId(long user_id) {
        this.m_userId = user_id;
    }


    /**
     * This method displays certain information as string.
     * @return returns a String
     */
    public String toString() {
        return "First Name: " + this.m_firstName + ", " + "Last Name: " + this.m_lastName + ", " + "UserId: " + this.m_userId;

    }


}
