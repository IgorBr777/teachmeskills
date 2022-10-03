package com.example.lib;


 class InterfaceCallback {

    public static void main(String[] args) {

        Button button = new Button(new LoginClickListener());

        button.buttonClicked();
    }


    static class LoginClickListener implements IAuthirization1 {


        @Override
        public void sendLoginRequest() {


            System.out.println("Login request was successfully sent ...");
        }
    }


    interface IAuthirization1 {


        void sendLoginRequest();

    }

    static class Button {

        IAuthirization1 iAuthirization1;

        public Button(IAuthirization1 action) {
            this.iAuthirization1 = action;
        }

        void buttonClicked() {
            iAuthirization1.sendLoginRequest();

        }

    }

}