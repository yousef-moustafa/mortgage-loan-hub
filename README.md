# Mortgage Loan Hub (MLH) Interface
The Mortgage Loan Hub (MLH) is a comprehensive Java interface designed to streamline and automate the mortgage loan application process. This interface provides a robust and scalable solution for managing the interactions between borrowers, lenders, and properties in a mortgage loan market.

## Features
- **Mortgage Market Initialization**: Effortlessly set up the mortgage market by specifying the number of borrowers, lenders, and properties. The interface handles the creation and management of these entities.
- **Loan Application**: Borrowers can apply for a mortgage loan by providing their personal information, employment details, assets, debts, and credit history. The interface compiles a complete application package, including the borrower's details, the desired property, and the chosen lender.
- **Application Processing**: The interface automates the application processing phase, determining the approval status based on the borrower's financial information, credit history, and the lender's criteria. If approved, a detailed loan estimate is generated, including loan amount, interest rate, and estimated monthly payments.
- **Loan Closing**: Once a processed application is approved, the interface facilitates the loan closing process. It generates a comprehensive closing disclosure document, ensuring transparency and compliance with regulatory requirements.

## Implementation Details
The MLH interface is implemented through the following key components:

1. **MLH Interface**: This interface defines the core methods for initializing the mortgage market, applying for a loan, processing applications, and closing approved loans.
2. **MortgageImplementer**: This class implements the MLH interface, providing the concrete implementation of the methods defined in the interface.
3. **Supporting Classes**: The project includes a suite of supporting classes that represent the various entities involved in the mortgage loan process, such as borrowers, lenders, properties, applications, credit histories, and loan estimates. These classes encapsulate the necessary data and functionality required for the mortgage loan operations.
4. **Test Suite**: A comprehensive test suite is provided to validate the correctness of the implementation. The `MortgageImplementerTest` class simulates real-world scenarios, ensuring the proper functioning of the MLH interface and its associated components.

## Getting Started
To get started with the Mortgage Loan Hub (MLH) interface, follow these steps:

1. Clone the repository or download the project files.
2. Import the project into your preferred Java development environment.
3. Explore the `MLH` interface and its implementations in the `MortgageImplementer` class.
4. Familiarize yourself with the supporting classes and their relationships.
5. Run the `MortgageImplementerTest` class to observe the interface in action and verify its functionality.

## Authors
- Yousef Moustafa
- Kareem Ahmed
- Mohamed Hossam
- Hussein Gaafar
