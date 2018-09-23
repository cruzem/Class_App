package week02.app;

/**
 * @author Emmanuel Cruz
 */

public class Account {

    private long m_accountId;
    private String m_accountName;
    private double m_balance;
    private User m_user;

    /**
     * Constructor for Account Class.
     */
    public Account() {
        super();
    }

    /**
     * Constructor for Account Class.
     * @param m_accountId parameter for accountId
     * @param m_user parameter for user
     * @param m_accountName parameter for accountName
     * @param m_balance parameter for balance
     */
    public  Account(long m_accountId, User m_user , String m_accountName, double m_balance) {
        this.m_accountId = m_accountId;
        this.m_user = m_user;
        this.m_accountName = m_accountName;
        this.m_balance = m_balance;
    }

    /**
     * Method compares Account name whether if it's equal, null or not equal.
     * @param obj parameter identifies the object and value being passed on to compare.
     * @return boolean
     */
    public boolean equals(Object obj) {
        if (obj instanceof Account) {
            Account u = (Account) obj;
            return getName() == u.getName();
        }

        return false;
    }

    /**
     * This method returns a long value.
     * @return long this method returns a long value that represents AccountId
     *
     */
    public long getAccountId() {
        return this.m_accountId;
    }

    /**
     * This method returns a double value.
     * @return double this method returns a double value that represents account balance
     *
     */
    public double getBalance() {
        return this.m_balance;
    }

    /**
     * This method returns a string.
     * @return String this method returns a string that represents that Account Name
     *
     */
    public String getName() {
        return this.m_accountName;
    }

    /**
     * This method returns a User object.
     * @return object this method returns a User object
     *
     */
    public User getUser() {
        return this.m_user;
    }

    /**
     * This method returns a long value.
     * @return String this method returns a long value that represents the accountId
     *
     */
    public long getUserId() {
        return this.m_accountId;
    }

    /**
     * Method doesn't return anything.
     * @param m_accountName parameter to set Account Name
     *
     */
    public void setName(String m_accountName) {
        this.m_accountName = m_accountName;
    }

    /**
     * Method doesn't return anything.
     * @param m_user parameter to set User
     *
     */
    public void setUser(User m_user) {
        this.m_user = m_user;
    }

    /**
     * This method displays certain information as string.
     * @return returns a String
     */
    public String toString() {
        return "Account Name: " + this.m_accountName + ", " + "User: " + this.m_user + ", " + "Balance: " + this.m_balance;

    }


}
