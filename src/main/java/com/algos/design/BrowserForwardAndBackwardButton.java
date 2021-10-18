package com.algos.design;

public class BrowserForwardAndBackwardButton {
    static Urls urls = null;
    static class Urls {
        private String value;
        private Urls next;
        private Urls previous;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Urls getNext() {
            return next;
        }

        public void setNext(Urls next) {
            this.next = next;
        }

        public Urls getPrevious() {
            return previous;
        }

        public void setPrevious(Urls previous) {
            this.previous = previous;
        }
    }
    public static void main(String[] args) {
        String input = "Google.com";
        System.out.println(addingAndNewUrl(input).getValue());
        // System.out.println(onClickBackword().getValue());
        System.out.println(addingAndNewUrl("yahoo").getValue());
        System.out.println(addingAndNewUrl("amazon").getValue());
        System.out.println(addingAndNewUrl("flipkart").getValue());
        System.out.println(onClickBackword().getValue());
        System.out.println(addingAndNewUrl("microsoft").getValue());
        System.out.println(onClickBackword().getValue());
        System.out.println(onClickforward().getValue());
    }
    // A--> B--> C--> D
    public static Urls addingAndNewUrl(String string){
        if(null==urls) {
            urls = new Urls();
            urls.setValue(string);
            urls.setPrevious(null);
            urls.setNext(null);
        }
        if(urls.getNext()!=null){
            urls.setNext(null);
            urls.setValue(string);
        }
        return urls;
    }
    public static Urls onClickBackword(){
        if(null==urls.getPrevious())
            return null;
        else{
            urls.setValue(urls.getPrevious().getValue());
            urls.setNext(urls.getPrevious().getNext());
            urls.setPrevious(urls.getPrevious().getPrevious());
        }
        return urls;
    }
    public static Urls  onClickforward() {
        if(null==urls.getNext())
            return null;
        else{
            urls.setValue(urls.getNext().getValue());
            urls.setNext(urls.getNext().getNext());
            urls.setPrevious(urls.getNext().getPrevious());
        }
        return urls;
    }
}

