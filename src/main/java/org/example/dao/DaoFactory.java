package org.example.dao;

public class DaoFactory {
    private static BookDao bookDao;

    private DaoFactory() {

    }

    public static BookDao getBookDao() {
        if (bookDao == null) {
            bookDao = new BookDaoImpl();
        }
        return bookDao;
    }
}
