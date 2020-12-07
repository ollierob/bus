const HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
    entry: {
        provision: ["./src/main/js/provision/ProvisionRouter.tsx"],
        deploy: ["./src/main/js/deploy/DeployRouter.tsx"],
        manage: ["./src/main/js/manage/ManageRouter.tsx"],
    },
    output: {
        path: __dirname + "/target/classes/js",
        filename: "[name].bundle.js",
        chunkFilename: "[name].bundle.js",
    },
    resolve: {
        extensions: [".ts", ".tsx", ".js", ".json", ".less"]
    },
    module: {
        rules: [
            {
                test: /\.tsx?$/,
                use: ["ts-loader"]
            },
            {
                test: /\.css$/,
                use: ["style-loader", "css-loader"]
            },
            {
                test: /\.less$/,
                use: [
                    {loader: 'style-loader'},
                    {loader: 'css-loader'},
                    {loader: 'less-loader', options: {lessOptions: {javascriptEnabled: true}}}
                ]
            }
        ]
    },
    optimization: {
        splitChunks: {
            chunks: "all",
            maxInitialRequests: Infinity,
            minSize: 0,
            maxSize: 1000000,
            cacheGroups: {
                vendor: {
                    name: "vendors",
                    test: /node_modules/
                }
            }
        }
    },
    plugins: [
        new HtmlWebpackPlugin({
            inject: false,
            chunks: ["provision"],
            publicPath: "/js",
            template: "src/main/resources/router.html.template",
            filename: "provision.html"
        }),
        new HtmlWebpackPlugin({
            inject: false,
            chunks: ["deploy"],
            publicPath: "/js",
            template: "src/main/resources/router.html.template",
            filename: "deploy.html"
        }),
        new HtmlWebpackPlugin({
            inject: false,
            chunks: ["manage"],
            publicPath: "/js",
            template: "src/main/resources/router.html.template",
            filename: "manage.html"
        })
    ]
}